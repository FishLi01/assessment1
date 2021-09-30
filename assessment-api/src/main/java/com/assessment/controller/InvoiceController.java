package com.assessment.controller;

import com.assessment.pojo.Invoice;
import com.assessment.service.InvoiceService;
import com.assessment.utils.IMoocJSONResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author FishLi
 * @describe TODO
 * @date 2021-09-28 11:08
 */
@Api(value = "发票业务相关接口",tags = "发票业务相关的controller")
@RestController
public class InvoiceController {
    @Autowired
    private InvoiceService invoiceService;

    @ApiOperation(value = "创建发票接口",notes = "创建发票的接口")
    @PostMapping("/saveInvoice")
    public IMoocJSONResult saveInvoice(@RequestBody Invoice invoice){
        invoiceService.saveInvoice(invoice);
        return IMoocJSONResult.ok();
    }
}
