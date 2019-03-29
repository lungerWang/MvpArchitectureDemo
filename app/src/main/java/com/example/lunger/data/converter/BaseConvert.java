package com.example.lunger.data.converter;

/**
 * Created by Allen on 2016/5/30.
 * 网络请求到的数据可以在第一时间做一次校验，避免一些null，或者类型的转换，这个操作可以放在rx的map操作符里，并在子线程执行
 * (optional)
 */
public class BaseConvert {

    /*public static BaseModel convertBase(ResultDTO<BaseDTO> resultDTO) {
        ResultUtil.validate(resultDTO);

        BaseDTO baseDTO = resultDTO.getData();
        if (baseDTO == null) {
            return null;
        }

        BaseModel baseModel = new BaseModel();
        baseModel.setId(baseDTO.getId());

        return baseModel;
    }*/











}
