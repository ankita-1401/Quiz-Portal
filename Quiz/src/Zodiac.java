import java.util.*;  //import all classes from util
class Node
{
Node left,right,middle1,middle2;
String data;
public Node (String d)//parameterized constructor
{
left=null;
middle1 = null;
middle2 = null;
right=null;
data=d;
}
}


class binarytree
{             //class binarytree is declared

Node root;

public binarytree()       //Default constructor
{
root=null;
}


public void display(){
   
    Node ptr = root;
   
   
   
    while (ptr!=null) {
 
    System.out.println("Choose from the scale of 1 to 4");
     System.out.println(ptr.data);
    Scanner input = new Scanner(System.in);
    int element = input.nextInt();

    if(element == 1){
    ptr = ptr.left;
    }
   
    else if(element == 2){
         ptr = ptr.middle1;
    }
   
   else if(element == 3){
         ptr = ptr.middle2;
    }
   
    else{
        ptr = ptr.right;
    }
   
    }  
}

}


public class Zodiac {   //Main class
public static void main(String[] args) {

 binarytree tree = new  binarytree();
 
 System.out.println("Zodiac sign ");
 tree.root = new Node("Choose your element \n1.Fire 2.Water 3.Air 4.Earth");
 
 tree.root.left = new Node("I am a bold person \n1.Strongly agree 2. Agree 3.Strongly disagree ");
 tree.root.left.left = new Node("I choose to do things on my own terms \n1.Strongly agree 2. Agree 3.Strongly disagree ");
 tree.root.left.middle1 = new Node("I exhibit leadership quality \n1.Strongly agree 2. Agree 3.Strongly disagree ");
 tree.root.left.middle2 = new Node("I get along with people easily \n1.Strongly agree 2. Agree 3.Strongly disagree ");
 
 tree.root.left.left.left = new Node("I am a confident person\n1.Strongly agree 2. Agree 3.Kinda disagree ");
 tree.root.left.left.middle1 = new Node("I don't trust people easily \n1.Strongly agree 2. Agree 3.Kinda disagree");
 tree.root.left.left.middle2 = new Node("I am a very energetic person \n1.Strongly agree 2. Agree 3.Kinda disagree");
 
 tree.root.left.middle1.left = new Node("I will easily take initiative in resolving complicated situations.\n1.Strongly agree 2. Agree 3.Kinda disagree");
 tree.root.left.middle1.middle1 = new Node("I hate to be called as an average person.\n1.Strongly agree 2. Agree 3.Kinda disagree");
 tree.root.left.middle1.middle2 = new Node("I am a very energetic person.\n1.Strongly agree 2. Agree 3.Kinda disagree");
 
 tree.root.left.middle2.left = new Node("I have an open mind and a philosophical view.\n1.Strongly agree 2. Agree 3.Kinda disagree");
 tree.root.left.middle2.middle1 = new Node("I believe in transforming my thoughts in concrete actions.\n1.Strongly agree 2. Agree 3.Kinda disagree ");
 tree.root.left.middle2.middle2 = new Node("I am a very energetic person.\n1.Strongly agree 2. Agree 3.Kinda disagree");
 
// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
 tree.root.middle1 = new Node("I am moved to tears by sad movies or stories. \n1.Strongly agree 2. Agree 3.Kinda disagree");
 tree.root.middle1.left = new Node("I never betray my loved ones.\n1.Strongly agree 2. Agree 3.Kinda disagree");
 tree.root.middle1.middle1 = new Node("I am an intuitive person.\n1.Strongly agree 2. Agree 3.Kinda disagree");
 tree.root.middle1.middle2 = new Node("I am a adventurous person. \n1.Strongly agree 2. Agree 3.Kinda disagree ");
 
 tree.root.middle1.left.left = new Node("I get very emotional and sensitive and care deeply about family and friends.\n1.Strongly agree 2. Agree 3.Kinda disagree");
 tree.root.middle1.left.middle1 = new Node("I am quick to help others.\n1.Strongly agree 2. Agree 3.Kinda disagree");
 tree.root.middle1.left.middle2 = new Node("I express myself creatively (e.g. through writing, art, dance, etc.).\n1.Strongly agree 2. Agree 3.Kinda disagree");
 
 tree.root.middle1.middle1.left = new Node("I often find myself daydreaming.\n1.Strongly agree 2. Agree 3.Disagree 4.Strongly disagree ");
 tree.root.middle1.middle1.middle1 = new Node("I express myself creatively (e.g. through writing, art, dance, etc.).\n1.Strongly agree 2. Agree 3.Kinda disagree ");
 tree.root.middle1.middle1.middle2 = new Node("People often come to me to solve their problems.\n1.Strongly agree 2. Agree 3.Kinda disagree");
 
 tree.root.middle1.middle2.left = new Node("I am known for my calm and cool behaviour.\n1.Strongly agree 2. Agree 3.Kinda disagree");
 tree.root.middle1.middle2.middle1 = new Node("I am very dedicated to what I do.\n1.Strongly agree 2. Agree 3.Kinda disagree");
 tree.root.middle1.middle2.middle2 = new Node("I express myself creatively (e.g. through writing, art, dance, etc.).\n1.Strongly agree 2. Agree 3.Kinda disagree");
 
 // -------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
 tree.root.middle2 = new Node("I look at the world as a place full of possibilities.\n1.Strongly agree 2. Agree 3.Kinda disagree");
 tree.root.middle2.left = new Node("When I listen to someone talk about a problem, I can identify with the way he or she is feeling.\n1.Strongly agree 2. Agree 3.Kinda disagree");
 tree.root.middle2.middle1 = new Node("I never hesitate to learn new things.\n1.Strongly agree 2. Agree 3.Kinda disagree");
 tree.root.middle2.middle2 = new Node("I love socializing. I love hearing other people's ideas, but I can also be pretty talkative yourself.\n1.Strongly agree 2. Agree 3.Kinda disagree ");
 
 tree.root.middle2.left.left = new Node("I am a deep thinker and love helping others.\n1.Strongly agree 2. Agree 3.Kinda disagree");
 tree.root.middle2.left.middle1 = new Node("I know exactly what I want to be to doing in 5 or 10 years from now.\n1.Strongly agree 2. Agree 3.Kinda disagree");
 tree.root.middle2.left.middle2 = new Node("I view things in an objective manner.\n1.Strongly agree 2. Agree 3.Kinda disagree");
 
 tree.root.middle2.middle1.left = new Node("I love travelling and exploring the world.\n1.Strongly agree 2. Agree 3.Disagree 4.Strongly disagree ");
 tree.root.middle2.middle1.middle1 = new Node("I can become extremely curious at times.\n1.Strongly agree 2. Agree 3.Disagree 4.Strongly disagree ");
 tree.root.middle2.middle1.middle2 = new Node("I view things in an objective manner.\n1.Strongly agree 2. Agree 3.Kinda disagree");
 
 tree.root.middle2.middle2.left = new Node("I love to talk to different people.\n1.Strongly agree 2. Agree 3.Kinda disagree");
 tree.root.middle2.middle2.middle1 = new Node("I am in constant chase for justice and equality.\n1.Strongly agree 2. Agree 3.Kinda disagree");
 tree.root.middle2.middle2.middle2 = new Node("I view things in an objective manner.\n1.Strongly agree 2. Agree 3.Kinda disagree");
 
 //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
 tree.root.right = new Node("I feel like I am an emotionally stable person.\n1.Strongly agree 2. Agree 3.Kinda disagree");
 tree.root.right.left = new Node("I am a master of self-control and have the ability to lead the way and manage many people who work for them at any time. \n1.Strongly agree 2. Agree 3.Kinda disagree");
 tree.root.right.middle1 = new Node("I believe in learning from my own mistakes and getting to the top based on my own experience.\n1.Strongly agree 2. Agree 3.Kinda disagree");
 tree.root.right.middle2 = new Node("I think efficiency is the key for every work that I do.\n1.Strongly agree 2. Agree 3.Kinda disagree");
 
 tree.root.right.left.left = new Node("I focus more on the material world and have the ability to use the most out of it.\n1.Strongly agree 2. Agree 3.Kinda disagree");
 tree.root.right.left.middle1 = new Node("I can be stiff and stubborn at times.\n1.Strongly agree 2. Agree 3.Kinda disagree");
 tree.root.right.left.middle2 = new Node("I think efficiency is the key for every work that I do.\n1.Strongly agree 2. Agree 3.Kinda disagree");
 tree.root.right.left.left.left = new Node("You are Capricorn\nStrengths:Responsible,Disciplined,Self Contorlled\nWeaknesses:Unforgiving,Condescending,Know-it-");
 
 tree.root.right.middle1.left = new Node("I am highly ambitious in terms of my career.\n1.Strongly agree 2. Agree 3.Kinda disagree");
 tree.root.right.middle1.middle1 = new Node("People like to share their problems or stories with me.\n1.Strongly agree 2. Agree 3.Kinda disagree");
 tree.root.right.middle1.middle2 = new Node("I think efficiency is the key for every work that I do.\n1.Strongly agree 2. Agree 3.Kinda disagree");
 
 tree.root.right.middle1.left = new Node("I usually stick to my routine.\n1.Strongly agree 2. Agree 3.Kinda disagree");
 tree.root.right.middle1.middle1 = new Node("I am very clear in my thoughts.\n1.Strongly agree 2. Agree 3.Kinda disagree");
 tree.root.right.middle1.middle2 = new Node("I think efficiency is the key for every work that I do.\n1.Strongly agree 2. Agree 3.Kinda disagree");
 
 tree.display();

}
}
