package com.hb.demo.test_hb.linkedList;

/**
 * author huangben 2023/8/13
 */
public class T_revertLinkedList_8_13 {

    public static void main(String[] args){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);

        node1.next = node2;
        node2.next = node3;
        T_revertLinkedList_8_13 t004 = new T_revertLinkedList_8_13();
        t004.printLinkedList(node1);
        t004.printLinkedList(t004.ReverseList(node1));

    }
    //链表输出函数
    void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

//定义链表函数
         static class ListNode {
        int val;
        ListNode next = null;
        public ListNode(int val) {
          this.val = val;
        }
      }

      //逆转函数
    public ListNode ReverseList(ListNode head) {
        //处理空链表
        if(head == null)
            return null;
        //cur代表当前位置，pre代表当前位置的前一个位置为空；
        ListNode cur = head;
        ListNode pre = null;
        //当前节点不为空，循环
        while(cur != null){
            //断开链表，要记录后续一个，保存留下来待会再次遍历用
            ListNode temp = cur.next;
            //当前的next指向前一个，让cur指向前一个
            cur.next = pre;
            //前一个更新为当前，pre移动到cur的位置
            pre = cur;
            //当前更新为刚刚记录的后一个，cur移动到之前暂存的位置继续重复遍历
            cur = temp;
        }
        return pre;
    }
}
