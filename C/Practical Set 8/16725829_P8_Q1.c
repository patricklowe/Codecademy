#include <stdio.h>
#include <stdlib.h>
#include <time.h>

struct card {                                 
   const char *face; // face of card
   const char *suit; // suit of card
}; 

typedef struct card Card; // declare structure card

void fillDeck( Card * const wDeck, const char *wFace[], const char *wSuit[]); // fill deck function
void shuffleDeck( Card * const wDeck ); // shuffle the ordered deck
void dealDeck( const Card * const wDeck); // print deck

int main( void ){ 
   Card deck[52];// 52 cards in the deck

   const char *face[] = { "Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
   const char *suit[] = { "Diamonds", "Hearts", "Clubs", "Spades"};

   srand(time(NULL) ); // allow for random calc

   fillDeck(deck, face, suit); // fill the deck function
   shuffleDeck(deck); // shuffle the ordered deck
   dealDeck(deck); // print the deck
}

void fillDeck(Card * const wDeck, const char * wFace[], const char * wSuit[] ){ 
   int i; // counter

   for(i=0; i<=51; i++){ 
      wDeck[i].face = wFace[i%13]; // assign a random face
      wDeck[i].suit = wSuit[i/13];//assign a random suit
   }
}

void shuffleDeck( Card * const wDeck )
{ 
   int i;
   int j;
   Card temp; // used for swapping
   
   for(i=0; i<52; i++){  
      j = rand() % 52; //selects random card
      temp = wDeck[i];       //puts current card into temp 
      wDeck[i] = wDeck[j]; //puts random card into current position
      wDeck[j] = temp;       // puts old current card into random slot
   }
} 

void dealDeck(const Card * const wDeck){ 
   int i;

	for(i=0; i<52; i++) {
	printf( "%s %s\n", wDeck[i].face, wDeck[i].suit); //prints the random deck
   }
}

