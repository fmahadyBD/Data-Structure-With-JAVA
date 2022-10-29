public class App {
int cap=10;
    int []Stack=new int[cap];
    int top=-1;
    public static void main(String[] args) throws Exception {
        
        App obj=new App();
        obj.push(10);
        obj.peek();
        obj.pop();
        obj.push(20);
        obj.peek();
        obj.pop();
        obj.push(30);
        obj.peek();
        obj.pop();
        obj.push(40);
        obj.peek();
        obj.push(50);
        
        
    }

    void  push(int x){
        if(top<cap-1){
            top++;
            Stack[top]=x;
            System.out.println("Successfully added! "+Stack[top]);

        }

    }
    int pop(){
        if(top>=0){
            top--;
            System.out.println("Successfuly deleted!");
            return 0;
        }else{
            System.out.println("Sorry there is no element!!");
            return -1;
        }
    }
    int peek(){
        if(top>=0){
            
            System.out.println("Here the element is :"+Stack[top]);
            return 0;
        }else{
            System.out.println("Sorry there is no element!!");
            return -1;
        }
    }
}
