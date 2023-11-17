class Solution {
    public int numRookCaptures(char[][] board) {
        int x=0;
        int y=0;
        for(int i=0;i<=7;i++) {
            for(int j=0;j<=7;j++) {
                if(board[i][j]=='R'){
                    x=i;
                    y=j;
                    break;
                }
            }
        }

        int c=0;
        for(int i=x;i<=7;i++) {
            if(board[i][y] =='B') {
                break;
            }
            else if(board[i][y] =='p') {
                c++;
                break;
            }
        }

        for(int i=x; i>=0;i--) {
            if(board[i][y] =='B') {
                break;
            }

            else if(board[i][y] =='p') {
                c++;
                break;
            }
        }

        for(int i=y;i<=7;i++) {
            if(board[x][i] =='B'){
                break;
            }

            else if(board[x][i]=='p'){
                c++;
                break;
            }
        }

        for(int i=y;i>=0;i++) {
            if(board[x][i] =='B'){
                break;
            }

            else if(board[x][i] =='p') {
                c++;
                break;
            }
        }
    return c;

    }
}

public class rookcapture999 {
    public static void main(String args[]) {
        Solution ay = new Solution();
        char [][] c= {{'.','.','.','.','.','.','.','.'},
                       {'.','p','p','p','p','p','.','.'},
                       {'.','p','p','B','p','p','.','.'},
                       {'.','p','B','R','B','p','.','.'},
                       {'.','p','p','B','p','p','.','.'},
                       {'.','p','p','p','p','p','.','.'},
                       {'.','.','.','.','.','.','.','.'},
                       {'.','.','.','.','.','.','.','.'}};

        System.out.println(ay.numRookCaptures(c));
    }
}