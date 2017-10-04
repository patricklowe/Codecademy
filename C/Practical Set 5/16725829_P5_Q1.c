/* Obtain the Public's Opinion on topics */
#include <stdio.h>

#define ISSUES 5
#define RATINGS 10

// function prototypes
void recordResponse (int i, int response);  //^^implement this
void highestRatings (); 
void lowestRatings (); //^^implement this
void displayResults();

int responses[ISSUES]; // Two-dimensional array of poll-ratings
const char *topics[ISSUES] = {"Science", "Religion", "Travel", "Business", "Social Media"}; // array of opinion topics

int main (void)
{
	int response, i; // the user's responses

	// Administer the poll.
	do {
	// ^^ Ask the user to rate the 5 topics in the topics array (for loop) remeber to check for for valid entries and record the response.
	for(i = 0; i<5; i++){
	printf("Please rate topic %s on a scale of 1-10: ", topics[i]);
	scanf("%d", &response);
	if(response > 10){
		response = 10;
	}
	else if( response < 0){
		response = 0;
	}
	
	recordResponse(i, response);
	}
	
	printf("%s", "Enter 1 to stop or 0 to allow a new person to rate the issues again: "); // Ask if the user wants to stop
	scanf("%d", &response); // get the user's response
	} while(response != 1);
	
	displayResults();
} 

// Records the user's response to a topic located at index i
void recordResponse(int issue, int rating)
{
  responses[issue] += rating;
} // end recordResponse

// get the highest rated topic (highest point total)
void highestRatings(void)
{
   int highRating = 0; 
   int highTopic = 0; 
   unsigned int i,j;
   
   for( i=0; i<ISSUES; i++) {
      int topicRating = 0;
		topicRating += responses[i];
		
      if (highRating < topicRating) {
         highRating = topicRating;
         highTopic = i;// index of the highest rated topic
      }
   }

   printf("\nThe highest rated topic was %s with a total rating of %d\n", 
      topics[highTopic], highRating);
} 

// get the lowest rated topic (lowest point total)
void lowestRatings(void) 
{
   //^^ implement this
   int lowRating = 0; 
   int lowTopic = 0; 
   unsigned int i,j;
   
   for( i=0; i<ISSUES; i++) {
      int topicRating = 0;
		topicRating += responses[i];

      if (lowRating > topicRating) {
         lowRating = topicRating;
         lowTopic = i;// index of the highest rated topic
      }
   }

   printf("The lowest rated topic was %s with a total rating of %d\n", 
      topics[lowTopic], lowRating);
}

// Output in tabular form the number of ratings per issue
void displayResults()
{
   // Output table header
   	printf("\nTopic Choices");
	unsigned int i;
   	
	for(i = 0; i <5; ++i) {
    printf("\n%s : %d", topics[i], responses[i]);
	}
   printf("\n");
    // Output the highest and lowest ratings for this poll
    highestRatings();
    lowestRatings();
} 



