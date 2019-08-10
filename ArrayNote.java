/*
ARRAYS: Array is an object in JAVA. Stored in heap memory.
int ar[];  //decleration
int []ar;
int[] ar;

ar = new int[5];//allocation

ar[3]=45;
ar[1]=42;
index  value  memory address
 0      0       8000
 1      42      8004
 2      0       8008
 3      45      8012
 4      0       8016



psvm(__)
{   //<datatype> <identifier>[];
int a; //normal variable;
int ar[]; // or int []ar; int[] ar;
ar=new int[5]; //allocation
ar[2]=45;
ar[3]=67; //initialization
SOP(“number of elements: ”+ar.length);
For(int i=0;i<n;i++)
{
SOP(i+”-”+ar[i]);
  }
}

int a[],b,c; // Only a is array
int []x,y,z; // All are array
int[] m,n,o; // All are array


int ar[]={23,46,75,89};  // declaration and initialization
for(int i=0;i<ar.length;i++)
{
 SOP(ar[i]);
}


int ar[];    // declaration
ar = new int[]{23,46,75,89}; // initialization

int ar[];    // declaration
ar=new int[4];   // memory allocation
ar[0]=23;    // initialization
ar[1]=46;    // initialization
ar[2]=75;    // initialization
ar[3]=89;    // initialization
*/
