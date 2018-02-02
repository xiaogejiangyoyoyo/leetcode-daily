package 剑指offer;

class ListNode1 {
    int val;
    ListNode1 next = null;

    ListNode1(int val) {
        this.val = val;
    }
}

//递归版本
public class a15_合并两个排序的链表 {
    private ListNode1 Merge(ListNode1 list1, ListNode1 list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        if (list1.val <= list2.val) {
            list1.next = Merge(list1.next, list2);
            return list1;
        } else {
            list2.next = Merge(list1, list2.next);
            return list2;
        }
    }
}
//非递归版本
/*
  if(list1 == null){
              return list2;
          }
          if(list2 == null){
              return list1;
          }
          ListNode mergeHead = null;
          ListNode current = null;     
          while(list1!=null && list2!=null){
              if(list1.val <= list2.val){
                  if(mergeHead == null){
                     mergeHead = current = list1;
                  }else{
                     current.next = list1;
                     current = current.next;
                  }
                  list1 = list1.next;
              }else{
                  if(mergeHead == null){
                     mergeHead = current = list2;
                  }else{
                     current.next = list2;
                     current = current.next;
                  }
                  list2 = list2.next;
              }
          }
          if(list1 == null){
              current.next = list2;
          }else{
              current.next = list1;
          }
          return mergeHead;
 */
