package LeetCode2;

import java.util.HashSet;

public class LeetCode36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public static boolean isValidSudoku(char[][] board) {
	    if(isValidRow(board)==false) {
	    	return false;
	    }
	    if(isValidColumn(board)==false) {
	    	return false;
	    }
	    if(isValid3(board)==false) {
	    	return false;
	    }
    	return true;
	}
     
    public static boolean isValidRow(char [][] board) {
    	HashSet<Character> set=new HashSet<Character>();
    	for(int i=0;i<board.length;i++) {
    		for(int j=0;j<board[0].length;j++) {
    			if(board[i][j]!='.') {
    				if(set.contains(board[i][j])) {
    					return false;
    				}else {
    					set.add(board[i][j]);
    				}
    			}
    		}
    		set.clear();
    	}
    	return true;
    }
    
    public static boolean isValidColumn(char [][] board) {
    	HashSet<Character> set=new HashSet<Character>();
    	for(int i=0;i<board.length;i++) {
    		for(int j=0;j<board[0].length;j++) {
    			if(board[j][i]!='.') {
    				if(set.contains(board[j][i])) {
    					return false;
    				}else {
    					set.add(board[j][i]);
    				}
    			}
    		}
    		set.clear();
    	}
    	return true;
    }
    public static boolean isValid3(char [][] board) {
    	for(int i=0;i<7;i+=3) {
    		for(int j=0;j<7;j+=3) {
    			boolean b=isValid(board,i,j);
    			if(b==false) {
    				return false;
    			}
    		}
    	}
    	return true;
    }
    
    public static boolean isValid(char [][] board,int row,int column) {
    	HashSet<Character> set=new HashSet<Character>();
    	for(int i=row;i<row+3;i++) {
    		for(int j=column;j<column+3;j++) {
    			if(board[i][j]!='.') {
    				if(set.contains(board[i][j])) {
    					return false;
    				}else {
    					set.add(board[i][j]);
    				}
    			}
    		}
    	}
    	return true;
    }

}
