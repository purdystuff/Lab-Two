
public class LinkedLists {

	public static void main(String[] args) {
		
		int count = 0;
		int currNum = 0;
		int sum = 0;
		
		LLNode<Integer> numbers;
		LLNode<Integer> sNode1 = new LLNode <Integer> (1);
		LLNode<Integer> sNode2 = new LLNode <Integer> (2);
		LLNode<Integer> sNode3 = new LLNode <Integer> (5);
		LLNode<Integer> sNode4 = new LLNode <Integer> (16);
				
		sNode1.setLink(sNode2);
		sNode2.setLink(sNode3);
		sNode3.setLink(sNode4);
		
		sNode2.setInfo(-2);
		
		LLNode<Integer> currNode = sNode1;
		
		while (currNode != null) {
			
			System.out.println(currNode.getInfo());
					
			if (currNode.getInfo() > 0) {
				count +=1;
			}
			currNode = currNode.getLink();

		}
		
					
		int n1 = sNode1.getInfo();
		int n2 = sNode2.getInfo();
		int n3 = sNode3.getInfo();
		int n4 = sNode4.getInfo();
				
		sum = n1+n2+n3+n4;
		
		System.out.println();
		System.out.println("The sum of numbers in this linked list is: " + sum);
		System.out.println();
		System.out.println("The number of positive integers is: " + count);
	}

}
