����   @ W
      java/lang/Object <init> ()V
  	 
   java/lang/Integer valueOf (I)Ljava/lang/Integer;  %4d
      java/lang/String format 9(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;      makeConcatWithConstants &(Ljava/lang/String;)Ljava/lang/String;     8(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;	      ! java/lang/System out Ljava/io/PrintStream;
 # $ % & ' java/io/PrintStream printf <(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
 # ) *  println , Task_2 Code LineNumberTable LocalVariableTable this LTask_2; main ([Ljava/lang/String;)V resNum I args [Ljava/lang/String; 
countInRow n maxNum k var10001 [Ljava/lang/Object; 	resNumStr Ljava/lang/String; countNumbers StackMapTable 7 = 
SourceFile Task_2.java BootstrapMethods H
 I J K  L $java/lang/invoke/StringConcatFactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; N   P   InnerClasses S %java/lang/invoke/MethodHandles$Lookup U java/lang/invoke/MethodHandles Lookup ! +           -   3     *� �    .   
       /        0 1   	 2 3  -  �  	   �<=�>6� Y� S:� �   :� Y� S� �   :� Y� S� �   :� Y� S� �   :� � � "W6h`� _h6hd6p� >� Y� S:� �   :�� � � "W� � � (6� �����    .   j         	      '  @  Y  r    �  �  �  �  �  �  �  �  �  �   � ! � % � & � ( � * /   \ 	 � J 4 5    � 6 7    � 8 5   � 9 5  	 � : 5   � ; 5   � < =  ' � > ?  � h @ 5  A    � �  B C   � [�   D    E F     G  M G  O Q   
  R T V 