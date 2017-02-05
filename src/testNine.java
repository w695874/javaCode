import org.junit.Test;

/**
 * Created by Administrator on 2017/2/1.
 */
public class testNine {

    @Test
    public  void test9(){
        Integer a[]={7,4,3,2,1};
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a.length;j++){
                for (int k=0;k<a.length;k++){
                    for (int m=0;m<a.length;m++){
                        if (a[i]+a[j]==9){

                            System.out.println(a[i]+","+a[j]);
                        }
                        if (a[i]+a[j]+a[k]==9){
                            System.out.println(a[i]+","+a[j]+","+a[k]);
                        }
                        if (a[i]+a[j]+a[k]+a[m]==9){
                            System.out.println(a[i]+","+a[j]+","+a[k]+","+a[m]);
                        }
                    }
                }
            }

        }
    }

}
