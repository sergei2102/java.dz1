����   @ `
      java/lang/Object <init> ()V
  	 
   task_1 fact (I)I
     triNum  java/util/Scanner	      java/lang/System in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     out Ljava/io/PrintStream;
   ! " #  java/io/PrintStream println % Enter integer number: 
   ' ( ) printf <(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
  + , - nextInt ()I
  / 0  close   2 3 4 makeConcatWithConstants (I)Ljava/lang/String;
   6 # 7 (Ljava/lang/String;)V  9 3 : (II)Ljava/lang/String;  9 Code LineNumberTable LocalVariableTable this Ltask_1; n I StackMapTable main ([Ljava/lang/String;)V args [Ljava/lang/String; sc Ljava/util/Scanner; num 
SourceFile Task_1.java BootstrapMethods O
 P Q R 3 S $java/lang/invoke/StringConcatFactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; U 
number =  W factorial of  is  Y triangle number of  is  InnerClasses \ %java/lang/invoke/MethodHandles$Lookup ^ java/lang/invoke/MethodHandles Lookup               <   3     *� �    =   
    	  
 >        ? @       <   G     � � d� h�    =        >        A B   C    	G     <   G     � � d� `�    =        >        A B   C    	G 	 D E  <   �     `� Y� � L� � � $� � &W+� *=+� .� � 1  � 5� � � � � 8  � 5� � � ;  � 5� � �    =   .           #  '  3  9  I  Y  _  >        ` F G    U H I  # = J B   K    L M     N  T N  V N  X Z   
  [ ] _ 