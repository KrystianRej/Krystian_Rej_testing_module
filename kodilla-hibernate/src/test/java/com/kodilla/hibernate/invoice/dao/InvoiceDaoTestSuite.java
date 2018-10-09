package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Test
    public void testInvoiceDaoSave() {
        //Given
        Item item1 = new Item(new BigDecimal("1584858525484"), 5, new BigDecimal("5000000"));
        Item item2 = new Item(new BigDecimal("5689548745"), 4, new BigDecimal("155648457"));
        Product product = new Product("Skrzynka");
        product.getItems().add(item1);
        product.getItems().add(item2);
        item1.setProduct(product);
        item2.setProduct(product);
        Invoice invoice = new Invoice("ABC#458795");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        invoice.setProduct(product);
        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();
        //Then
        Assert.assertNotEquals(0, id);
        //CleanUp
        invoiceDao.delete(id);
    }
}
