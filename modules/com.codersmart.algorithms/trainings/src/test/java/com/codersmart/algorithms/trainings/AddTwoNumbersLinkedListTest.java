package com.codersmart.algorithms.trainings;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.w3c.dom.NodeList;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersLinkedListTest {

    AddTwoNumbersLinkedList addTwoNumbersLinkedList = new AddTwoNumbersLinkedList();
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getLinkedList() {

        AddTwoNumbersLinkedList.ListNode numbers = addTwoNumbersLinkedList.getLinkedList(678);
        assertEquals(8, numbers.val);
        assertEquals(7, numbers.next.val);
        assertEquals(6, numbers.next.next.val);

    }

    @Test
    void addTwoNumbers() {
        AddTwoNumbersLinkedList.ListNode opLeft = addTwoNumbersLinkedList.getLinkedList(1278);
        AddTwoNumbersLinkedList.ListNode opRight = addTwoNumbersLinkedList.getLinkedList(234567);
        AddTwoNumbersLinkedList.ListNode result = addTwoNumbersLinkedList.addTwoNumbers(opLeft, opRight);

        // 1278 + 234567 = 235845 ==>> 548532
        assertEquals(5, result.val);
        assertEquals(4, result.next.val);
        assertEquals(8, result.next.next.val);
        assertEquals(5, result.next.next.next.val);
        assertEquals(3, result.next.next.next.next.val);
        assertEquals(2, result.next.next.next.next.next.val);
    }
}