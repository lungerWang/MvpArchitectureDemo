package com.example.lunger.data.net.impl;


import com.example.lunger.data.repository.ParentRepository;
import com.example.lunger.data.repository.RepositoryManager;

/**
 * Created by Lunger on 2016/5/31.
 * 单例的网络请求统一管理类，工厂模式
 */
public class RepositoryNetManagerImpl implements RepositoryManager {

    private ParentRepository commodityRepository;

    private static final RepositoryManager repositoryManager = new RepositoryNetManagerImpl();

    /**
     * 获取总Repository
     * @return
     */
    public static RepositoryManager getRepositoryManager() {
        return repositoryManager;
    }

    private RepositoryNetManagerImpl() {
        commodityRepository = new ParentServiceImpl();
    }

    /**
     * 获取爸妈图书馆Repository
     * @return
     */
    @Override
    public ParentRepository getParentRepository() {
        return commodityRepository;
    }

}
