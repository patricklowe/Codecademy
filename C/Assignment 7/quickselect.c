#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#define MAX_SIZE 10000
#if defined(_WINDOWS)
#include <windows.h>
double get_cpu_time(){
    FILETIME a,b,c,d;
    if (GetProcessTimes(GetCurrentProcess(),&a,&b,&c,&d) != 0){
        return
            (double)(d.dwLowDateTime |
            ((unsigned long long)d.dwHighDateTime << 32)) * 0.0000001;
    }else{
        return 0;
    }
}
#else
double get_cpu_time() {
  return clock()*1.0/CLOCKS_PER_SEC;
}
#endif

void read_data_from_file(char fname[], double a[], int size)
{
  FILE *fp = fopen(fname, "r");
  int i = 0;
  while (!feof(fp) && i<size)
    {
      fscanf(fp, "%lf", &a[i++]);
    }
  printf("Read %d values from %s\n", i, fname);
}
int main(void)
{
	int left, right;
	int pivot_index, store_index;
	int i, k;
	double get_cpu_time();
	void read_data_from_file(char fname[], double a[], int size);
	double tmp;
	double start, end;
	double a[MAX_SIZE];
	double pivot_value;
	read_data_from_file("array.dat", a, MAX_SIZE);
	k = MAX_SIZE/2; 
	left = 0;
	right = MAX_SIZE;
	start = get_cpu_time();
	srand(time(0));
	while(left !=k)
	{
		pivot_index = rand()%(right-left)+left;
		pivot_value = a[pivot_index];
		tmp = a[pivot_index]; a[pivot_index]=a[right-1];
			a[right-1]=tmp;
		store_index = left;
		for (i=left; i<right-1; i++)
		{
			if (a[i]<pivot_value)
			{
				tmp=a[store_index];a[store_index]=a[i];
				a[i]=tmp;
				store_index++;
			}
		}
		tmp=a[right-1];a[right-1]=a[store_index];a[store_index]=tmp;
		pivot_index = store_index;
		if (k<=pivot_index)
		right=pivot_index;
		else
		left=pivot_index+1;
	}
	end = get_cpu_time();
	printf("The program took %lf seconds\n",(end-start));
	printf("Median is %lf\n", a[k-1]);
	return 0;
}



