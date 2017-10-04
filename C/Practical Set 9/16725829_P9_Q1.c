/*
A stack is a data which can be represented as a linked list. A stack is a constrained version of a
 linked list because it is a last in first out (LIFO) data structure. Nodes can only
 be added or removed at the top of the stack. Modify the C Program Linked List given
 in the lecture and on Moodle to create a stack. The same functions for adding,
  removing, printing nodes should be present.
*/
  #include <stdio.h>
  #include <stdlib.h>
// Stack
   // self-referenti al structu re
 struct listNode {
   char data; // each l i stNode contai ns a character
   struct listNode *nextPtr; // pointer to next node
   } ;
   typedef struct listNode ListNode; // synonym for struct listNode
   typedef struct listNode *ListNodePtr; // synonym for ListNode*

  // prototypes
   void insert(ListNodePtr *sPtr, char value);
   char delete(ListNodePtr *sPtr);
   int isEmpty(ListNodePtr sPtr);
   void printList(ListNodePtr currentPtr);
   void instructions(void);

   int main(void)
    {
         ListNodePtr startPtr = NULL ; //ini tially there are no nodes
         ListNodePtr LastPtr = startPtr ; 
		 char item ; //char entered by user
         instructions(); //di spl ay the menu
          printf("%s\n", "? ") ;
          unsigned int choice; //user's choice
         scanf("%u",&choice);
       //loop while user does not choose 3
      while (choice ==1 || choice ==2){
            switch (choice){
                  case 1:
                        printf("%s","Enter a character: ");
                        scanf("\n%c",&item);
                        insert(&startPtr, item); //insert item 1 n l i st
                        system("cls");
                        printList(startPtr);
                         instructions();
						break ;
                  case 2: //delete an element
                          //if l ist is not empty
                        if (!isEmpty(startPtr)){
                           char val =delete(&LastPtr);//remove item
						      printf("%c deleted.\n" ,val);
						         system("cls");
                              printList(startPtr);
                               instructions();
							          }

                        else {
                                  system("cls");
                                  puts("List is empty.\n");
                                  instructions();
                              }
                        break;
                  default:
                        puts("Invalid choice.\n");
                        instructions();
                        break ;
                           }
            printf("%s", "? ") ;
            scanf("%u" , &choice);
	  }

      puts ( " End of run. ") ;
	  return 0;
    }

 //display program instructions to user
 void instructions(void)
 {
puts (" Enteryour choice:\n"
       "1 to insert an element into the list.\n"
       "2 to delete an element from thelist.\n"
       "3 to end. "
);
 }
 //insert a new value into the list in sorted order
 void insert(ListNodePtr *sPtr, char value)
 {
     ListNodePtr newPtr = malloc(sizeof(ListNode)); //create node
     if (newPtr != NULL) { //is space available?
       newPtr->data =value; //place value in node
       newPtr->nextPtr = NULL ; //node does not link to another node
           	 //insert new node at beginning of list
	   if(*sPtr == NULL ){
          *sPtr = newPtr;
              }
      else { //insert new node between previousPtr and currentPtr
             newPtr->nextPtr = *sPtr;
            *sPtr = newPtr;
              }
    }
   else {
       printf("%c not inserted. No memory avail able .\n" , value);
      }
}

  //delete a l ist element
   char delete(ListNodePtr *sPtr)
   {
               char value;
              //delete first node if a match is found
			  if ((*sPtr)->nextPtr == NULL){
				  value =(*sPtr)->data;
				  *sPtr = (*sPtr)->nextPtr;
				  return value;
			  }
			  else {

	           value = (*sPtr)-> data;
              *sPtr = (*sPtr)->nextPtr;

                return value;
               }

   }

  //return 1 if the l i st is empty, 0 otherwi se
   int isEmpty(ListNodePtr sPtr)
    {
        return sPtr == NULL ;
  }

  //print the l ist
  void printList(ListNodePtr currentPtr)
   {
       //if li st is empty
       if (isEmpty(currentPtr)){
     puts("List is empty.\n");

          }
   else {
                puts("\n\nThe list is:\n\n");
              //while not the end of the l i st
     while (currentPtr != NULL){
               printf("%c --> ", currentPtr->data );
             currentPtr = currentPtr->nextPtr;
             }
             puts("NULL\n");
         }
   }

   void  printList_rev(ListNodePtr currentPtr)
{
    if (currentPtr == NULL)
    {
        printf("list is empty\n");
        return;
    }

    if (currentPtr->nextPtr != NULL)
    {
        printList_rev(currentPtr->nextPtr);
    }

    printf("%c<-- ", currentPtr->data);
}
