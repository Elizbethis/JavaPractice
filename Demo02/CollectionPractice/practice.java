package Second.Demo02.CollectionPractice;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class practice {
    public static void main(String[] args) {
        //带头节点的链表
        ListNode listHead = new ListNode(-9527);

        ListNode l1 = new ListNode(123);
        ListNode l2 = new ListNode(345);
        ListNode l3 = new ListNode(567);
        ListNode l4 = new ListNode(789);
        ListNode l5 = new ListNode(1314);

        addNode(listHead, l1);
        addNode(listHead, l2);
        addNode(listHead, l3);
        addNode(listHead, l4);

        addNode(listHead, l2, l5);

        removeNode(listHead, l3);

        showListNode(listHead);
    }

    /**
     * 将一个节点添加到链的末尾
     * @param listNode 链
     * @param node 要填加的节点
     */
    private static void addNode(ListNode listNode, ListNode node){
        if (null == listNode){
            listNode = node;
        }
        //找到最后一个节点
        if (null != listNode){
            while (listNode.next != null){
                listNode = listNode.next;
            }
            listNode.next = node;
        }
    }

    /**
     * 将 node2 添加到 node1 的后面
     * @param listNode 链
     * @param node1 目标节点地址
     * @param node2 要插入的节点
     */
    private static void addNode(ListNode listNode, ListNode node1, ListNode node2){
        ListNode currNode;
        while (listNode.next != null){
            currNode = listNode.next;
            if (currNode.val == node1.val){
                node2.next = currNode.next;
                listNode.next.next = node2;
                break;
            }
            listNode = currNode;
        }
    }

    /**
     * 在链中删除指定的节点
     * @param listNode 链
     * @param node 要删除的节点
     */
    private static void removeNode(ListNode listNode, ListNode node){
        ListNode currNode;
        while (listNode.next != null){
            currNode = listNode.next;
            if (currNode.val == node.val){
                listNode.next = currNode.next;
            }
            listNode = currNode;
        }
    }

    /**
     * 显示链表内容
     * @param listNode
     */
    private static void showListNode(ListNode listNode){
        // 个人习惯头结点中不存储东西方便判断头结点
        listNode = listNode.next; // 跳过头结点

        while (null != listNode){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}