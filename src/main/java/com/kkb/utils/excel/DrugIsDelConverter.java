package com.kkb.utils.excel;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.converters.ReadConverterContext;
import com.alibaba.excel.converters.WriteConverterContext;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.data.WriteCellData;

/**
 * String and string converter
 *
 * @author Jiaju Zhuang
 */
public class DrugIsDelConverter implements Converter<Integer> {
    @Override
    public Class<?> supportJavaTypeKey() {
        return Integer.class;
    }

    @Override
    public CellDataTypeEnum supportExcelTypeKey() {
        return CellDataTypeEnum.STRING;
    }

    /**
     * 这里读的时候会调用，导入的时候
     *
     * @param context
     * @return
     */
    @Override
    public Integer convertToJavaData(ReadConverterContext<?> context) {
        String statausStr = context.getReadCellData().getStringValue();
        if ("销售中".equals(statausStr)){
            return 0;
        }else {
            return 1;
        }
    }

    /**
     * 这里是写的时候会调用，导出的时候
     *
     * @return
     */
    @Override
    public WriteCellData<?> convertToExcelData(WriteConverterContext<Integer> context) {
        int value = context.getValue();
        if (value==0)
        {
            return new WriteCellData<>("销售中");
        }else {
            return new WriteCellData<>("已下架");
        }
    }

}
