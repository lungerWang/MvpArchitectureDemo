package com.example.lunger.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lunger.R;
import com.example.lunger.data.net.impl.RepositoryNetManagerImpl;
import com.example.lunger.data.param.ParentLibParam;
import com.example.lunger.data.repository.RepositoryManager;
import com.example.lunger.domain.model.ParentLibListModel;
import com.example.lunger.presenter.GetParentLibPresenter;
import com.example.lunger.presenter.impl.GetParentLibPresenterImpl;
import com.example.lunger.view.adapter.ParentLibListAdapter;
import com.example.lunger.view.base.BaseActivity;
import com.example.lunger.view.event.MainEvent;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Allen on 2017/04/01.
 * CleanArchitecture base on MVP pattern，业务与视图真正分离，低耦合，方便拓展，代码嵌套少阅读性好
 */
public class MainActivity extends BaseActivity<MainEvent> implements GetParentLibPresenter.View {

    private GetParentLibPresenter mGetParentLibPresenter;//一个接口操作对应一个Presenter
    private List<ParentLibListModel.List> parentList = new ArrayList<>();
    private ParentLibListAdapter mAdapter;
    private TextView tv_test_event_bus;
    private ListView mListView;
    private ProgressBar mProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidget();
        initPresenter();
        getData();
    }


    private void initWidget() {
        mListView = (ListView) findViewById(R.id.lv_parent);
        mProgressBar = (ProgressBar) findViewById(R.id.progress);
        tv_test_event_bus = (TextView) findViewById(R.id.tv_test_event_bus);
        mAdapter = new ParentLibListAdapter(this, parentList);
        mListView.setAdapter(mAdapter);
    }

    private void initPresenter() {
        RepositoryManager repositoryManager = RepositoryNetManagerImpl.getRepositoryManager();
        mGetParentLibPresenter = new GetParentLibPresenterImpl(repositoryManager.getParentRepository(), this);
    }

    public void getData() {
        mGetParentLibPresenter.getParentLib("16", "1");
    }

    /**
     * EventBus事件通知
     *
     * @param event
     */
    @Override
    public void onEventMainThread(MainEvent event) {
        switch (event.getEventId()) {
            case MainEvent.TYPE_ONE:
                String message = (String) event.getData();
                tv_test_event_bus.setText(message);
                break;
            default:
                break;
        }

    }

    /**
     * 一个接口数据获取成功回调
     *
     * @param data
     */
    @Override
    public void onGetParentLibSuccess(ParentLibListModel data) {
        parentList.addAll(data.getData());
        mAdapter.notifyDataSetChanged();
    }

    /**
     * 一个接口失败回调
     *
     * @param failCode
     * @param errorMsg
     */
    @Override
    public void onGetParentLibFailed(int failCode, String errorMsg) {
        Toast.makeText(this, errorMsg, Toast.LENGTH_LONG).show();
    }

    @Override
    public void showProgress() {
        mProgressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        mProgressBar.setVisibility(View.GONE);
    }

    @Override
    public void showMessage(String message) {

    }

    public void goToSecond(View view) {
        startActivity(new Intent(this, SecondActivity.class));
    }
}
