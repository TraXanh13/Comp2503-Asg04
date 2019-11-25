import java.util.Iterator;
import java.util.Comparator;

/** 
 * COMP 2503 Fall 2019 Assignment 4 
 * 
 * BST class is a binary search tree
 * of generic type T that implements Comparable
 * it implements iteratable interface.
 *  
 * Last updated by @author Maryam Elahi
 * @date Fall 2019
 * 
 */

public class BST<T extends Comparable<T>> implements Iterable<T>
{
   /* The nodes of the tree. 
    */
   class BSTNode implements Comparable<BSTNode>
   {
      private T data;
      private BSTNode left; 
      private BSTNode right; 
     
      public BSTNode(T d) 
      {
         setLeft(null);
         setRight(null);
         setData(d);
      }

      public T getData() { return data; }
      public void setData(T d) { data = d; }

      public void setLeft(BSTNode l) { left = l;}
      public void setRight(BSTNode r) { right = r;}
      public BSTNode getLeft()  { return left;}
      public BSTNode getRight()  { return right;}

      public int compareTo(BSTNode o) 
      {
         return ordering.compare(this.getData(), o.getData());
      }
   }
   
   // The different traversal types. 
   public static final int INORDER    = 0;
   public static final int PREORDER   = 1;
   public static final int POSTORDER  = 2;
   public static final int LEVELORDER = 3;
   
   // the root of the tree
   private BSTNode root;
   // the current size of the tree
   private int size;
   
   /*
    * TODO: add any other internal state variables required to implement:
    *		- the ordering for your BST 
    *		(Hint: Use ordering, which is an internal comparator object)
    * 
    *		- your iterator logic	
    *		(Hint: keep a queue for the iterator state)
    */


   /* The ordering of the tree is determined by the value 
    * of ordering. 
    * There is no getter/setter for ordering as it cannot be changed once 
    * the tree is built. 
    * By default, ordering uses the natural ordering of T.
    * The default ordering object can be replaced by another comparator object on construction. 
    */
   private Comparator<T> ordering = new Comparator<T>() 
      {
         public int compare(T t1, T t2)
         { 
            return t1.compareTo(t2);
         }
      };
      
      // private class inOrderIterator<T> implements Iterator<T> {
	   /* 
	    * TODO: implement an in-order iterator class
	    * (Hint: use a queue (make it a member of BST class), 
	    * start by doing an in-order traverse
	    * use IteratorVisit to enqueue the
	    * data element in the nodes to the queue in the correct order. 
	    * Then, the next() method 
	    * will simply dequeue nodes until it is empty.
	    */
      //}

	  /* The default visit action, simply print the data in the node using the 
	   * toString() method. 
	   */
      class DefaultVisit implements Visit<T>
      {
    	  public void visit(T t) 
    	  {
    		  if (t != null) System.out.println(t);
    	  }
      }

	  /* Visit action when creating an iterator. Put the node into a queue. 
	   */
	  class IteratorVisit implements Visit<T>
	  {
	     public void visit(T t) 
	     {
	   	  // TODO: Implement your logic for the visit method
	   	  // (Hint: enqueue t)
	     }
	  }
        

   /** Create a new BST using the natural ordering of T. 
    */
   public BST()
   {
	   	// TODO: initialize internal state variables
   }

   /** Create a new BST using the ordering determined by c
    *  @param c A Compartor to determine the ordering of elements in the tree. 
    */
   public BST(Comparator<T> c)
   {
	   	// TODO: initialize internal state variables
   }

   /** 
    * Return true if element d is present in the tree. 
   */
   public T find(T d) 
   {
      return find(d, root); 
   }

   /** Add element d to the tree. The ordering of the elements 
    *  will be determined by the value of ordering. 
    */
   public void add(T d)
   {
      BSTNode n = new BSTNode(d); 
      if (root == null) 
      {
         size++;
         root = n; 
      }
      else 
      {
         add(root, n); 
      }
   }

   /** Return the height of the tree. 
    */
   public int height() 
   {
      return height(root);
   }

   /** Return the number of nodes in the tree. 
    */
   public int size() 
   { 
      return size;
   }
   
   /** Perform a Traverse. The type of traverse is determined by the 
    *  parameter travType, which is One of BST.INORDER, 
    *  BST.POSTORDER, BST.PREORDER, BST.LEVELORDER, BST.REVINORDER
    *  For each node perform the default visit action, DefaultVisit.
    */
   public void traverse(int travType) 
   {
      traverse(root, travType, new DefaultVisit());
   }

   /** Perform a Traverse. The type of traverse is determined by the 
    *  parameter travType, which is one of BST.INORDER, BST.POSTORDER, 
    *  BST.PREORDER, BST.LEVELORDER, BST.REVINORDER
    *  Use the visit action specified by v. 
    */
   public void traverse(int travType, Visit<T> v) 
   {
      traverse(root, travType, v);
   }
   
   /** Return an in-order Iterator over this tree. 
    *  @returns an iterator
    */
   public Iterator<T> iterator() 
   {
	   // TODO: initialize an inOrderIterator object and return the reference.
	   return null;
   }

   // Private methods --------------------------------
   
   private T find(T d, BSTNode r) 
   {
	   // TODO:
	   return null;
   } 


   /* Do the actual add of node r to tree rooted at n */
   private void add(BSTNode r, BSTNode n) 
   {
	   // TODO:
   }
     

   /* Implement a height method. */
   private int height(BSTNode r) 
   {
	   // TODO:
	   return 0;
   } 


   /* Traverse the tree.  travtype determines the type of 
      traversal to perform. 
      v is the action to perform 
   */
   private void traverse(BSTNode r, int travType, Visit<T> v) 
   {
      if (r != null) 
      {
         switch (travType) 
         {
            case INORDER: 
            		 // TODO:
                     break;
            case PREORDER:
       		 		 // TODO:
                     break;
            case POSTORDER: 
 	  		 		 // TODO:
 	                 break;
            case LEVELORDER:
            		 // TODO:
                     break;
         }
      }
   }
}
