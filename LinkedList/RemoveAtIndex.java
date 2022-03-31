public void removeAt(int idx) {
      if(size == 0){
        System.out.println("List is empty");
      }
      else if (idx < 0 || idx >= size ) {
        System.out.println("Invalid arguments");
      } 
      else if(idx == size -1){
        removeLast();
      }
      else if(idx == 0){
        removeFirst();
      }
      else {
        Node temp = head;
        for (int i = 0; i < idx-1; i++) {
          temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }
}
