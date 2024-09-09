public class Q1 {
    public static void main(String[] args) {
        int arr[][]={{0,1,12,3},{4,5,6,7},{8,9,10,11}};
        int target=6;
int flag=0;
        for (int i=0;i<arr.length;i++)
        {

            for (int j = 0; j<arr[i].length; j++)
            {
                if (arr[i][j]==target)
                {
                    System.out.println(target);
                    System.out.println(i+" "+j);
                    flag++;
                    break;
                }

            }
if (flag!=0)
{
    break;
}
        }
    }
}
