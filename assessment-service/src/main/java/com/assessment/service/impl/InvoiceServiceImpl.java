package com.assessment.service.impl;

import com.assessment.mapper.InvoiceMapper;
import com.assessment.pojo.Invoice;
import com.assessment.service.InvoiceService;
import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author FishLi
 * @describe TODO
 * @date 2021-09-28 11:14
 */
@Service
public class InvoiceServiceImpl implements InvoiceService {
    @Autowired
    private InvoiceMapper invoiceMapper;
    @Autowired
    private Sid sid;
    @Override
    public void saveInvoice(Invoice invoice) {
        invoice.setId(sid.nextShort());
        invoice.setInvoiceStatus(0);
        invoiceMapper.insert(invoice);
    }
}
