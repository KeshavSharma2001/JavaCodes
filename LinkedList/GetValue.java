public int getAt(int idx){
      if(size == 0){
        System.out.println("List is empty");
        return -1;
      }
      if(idx > size-1 || idx < 0){
        System.out.println("Invalid arguments");
        return -1;
      }

      Node temp = head;
      for (int i = 0; i < idx ; i++) {
        temp = temp.next;
      }
      return temp.data;
}
