public static void removeDups(LinkedListNode n) {
    LinkedListNode current = n;
    LinkedListNode prev = null;
    HashSet<Integer> a = new HashSet<Integer>();

    while (current != null) {
      if (a.contains(current.data)) {
        prev.setNext(current.next);
      }
      else {
        a.add(current.data);
        prev = current;
      }
      current = current.next;
    }
}