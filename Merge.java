public class Merge {
    void merge(int a[],int l, int m,int r)
    {
        int n1=m-l+1;
        int n2=r-m;
        int L[]=new int[n1];
        int R[]=new int[n2];
        for (int i=0;i<n1;++i)
        L[i]=a[l+i];
        for(int j=0;j<n2;++j)
        R[j]=a[m+1+j];
        int i=0,j=0;
        int k=l;
        while(i<n1 && j<n2)
        {
            if (L[i]<=R[j])
            {
                a[k]=L[i];
                i++;
            }
            else{
                a[k]=R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            a[k] = L[i];
            i++;
            k++;
        }
        while(j<n2){
            a[k]=R[j];
            j++;
            k++;}
        }
            void sort(int a[],int l,int r)
            {
                if (l<r){
                    int m=(l+r)/2;
                
                //sort first and second halves
                sort (a,l,m);
                sort(a,m+1,r);
                
                //merge the sorted halves
                merge(a,l,m,r);
            }
        }
            static void printArray(int a[]){
int n=a.length;
for(int i=0;i<n;i++)
{
    System.out.println(a[i]);
}}
public static void main(String args[])
            {
                int a[]={7,4,11};
                System.out.println("given array");
                printArray(a);
                Merge ob=new Merge();
                ob.sort(a,0,a.length-1);
                System.out.println("sorted array");
                printArray(a);
            }
}
        

    

