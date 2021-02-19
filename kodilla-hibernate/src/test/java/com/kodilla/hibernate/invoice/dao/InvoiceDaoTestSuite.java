package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    ProductDao productDao;

    @Autowired
    ItemDao itemDao;

    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {

        //Given
        Product product1 = new Product("Nice product");
        Product product2 = new Product("Bad product");
        Product product3 = new Product("Okay product");
        productDao.save(product1);
        productDao.save(product2);
        productDao.save(product3);

        Invoice invoice1 = new Invoice("123456789");
        Invoice invoice2 = new Invoice("987654321");
        invoiceDao.save(invoice1);
        invoiceDao.save(invoice2);

        Item item1 = new Item(product1, BigDecimal.valueOf(999.99), 19, invoice1);
        Item item2 = new Item(product3, BigDecimal.valueOf(400.00), 99, invoice1);
        Item item3 = new Item(product1, BigDecimal.valueOf(900.87), 5, invoice2);
        Item item4 = new Item(product2, BigDecimal.valueOf(199.99), 45, invoice2);
        Item item5 = new Item(product1, BigDecimal.valueOf(9999.99), 2, invoice1);
        itemDao.save(item1);
        itemDao.save(item2);
        itemDao.save(item3);
        itemDao.save(item4);
        itemDao.save(item5);

        //When
        int invoiceOneId = invoice1.getId();
        int invoiceTwoId = invoice2.getId();
        int numberOfInvoiceOneItems = itemDao.countByInvoice_Id(invoice1.getId());
        int numberOfInvoiceTwoItems = itemDao.countByInvoice_Id(invoice2.getId());

        //Then
        Assertions.assertNotEquals(0, invoiceOneId);
        Assertions.assertNotEquals(0, invoiceTwoId);
        Assertions.assertEquals(3, numberOfInvoiceOneItems);
        Assertions.assertEquals(2, numberOfInvoiceTwoItems);

        //CleanUp
        try {
            invoiceDao.deleteById(invoiceOneId);
            invoiceDao.deleteById(invoiceTwoId);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}