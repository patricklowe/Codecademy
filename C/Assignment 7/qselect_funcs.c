#include <time.h>
#include <stdio.h>
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
