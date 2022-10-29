import java.util.Arrays;

public class CodeWithoutInpuut {
    public void aa(){
   
        int a[]={4,3,2,7,8,-1};
        int tem;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    tem=a[i];
                    a[i]=a[j];
                    a[j]=tem;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
       // System.out.println(Arrays.toString(a));


    }
}
    

