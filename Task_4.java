����   @ �
      java/lang/Object <init> ()V   	 
     java/lang/System out Ljava/io/PrintStream;  G=======================================================================
      java/io/PrintStream println (Ljava/lang/String;)V  java/util/Scanner	 
    in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V ! /Enter an expression like this:  ?54 + 1?1 = 375 # MBy default (pressing Enter) the expression will be equal to '?54 + 1?1 = 375' % .Enter your expression or press Enter, please: 
  ' ( ) nextLine ()Ljava/lang/String; + ?54 + 1?1 = 375 - =
 / 0 1 2 3 java/lang/String split '(Ljava/lang/String;)[Ljava/lang/String;
 / 5 6 ) trim
 8 9 : ; < java/lang/Integer parseInt (Ljava/lang/String;)I > java/lang/NumberFormatException
 = @ A ) 
getMessage   C D E makeConcatWithConstants &(Ljava/lang/String;)Ljava/lang/String; G +
 / I J < indexOf
 / L M N charAt (I)C  P D Q '(Ljava/lang/String;C)Ljava/lang/String;
 / S T U length ()I  W D X '(Ljava/lang/String;I)Ljava/lang/String;  C [ 	BINGO !!!  ] D ^ (I)Ljava/lang/String; ` %s + %s = %s

 8 b c d valueOf (I)Ljava/lang/Integer;
  f g h printf <(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream; j Task_4 Code LineNumberTable LocalVariableTable this LTask_4; main ([Ljava/lang/String;)V var18 !Ljava/lang/NumberFormatException; var17 j I args [Ljava/lang/String; taskStr Ljava/lang/String; numOne numTwo 
exprResult strOne strTwo 
strOneVers 
strTwoVers myDigit sc Ljava/util/Scanner; expressionArr size terms 	plusIndex i StackMapTable x 
SourceFile Task_4.java BootstrapMethods �
 � � � D � $java/lang/invoke/StringConcatFactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; � NumberFormatException:  �  � NumberFormatException  � The desired digit is  InnerClasses � %java/lang/invoke/MethodHandles$Lookup � java/lang/invoke/MethodHandles Lookup ! i           k   3     *� �    l   
    	  
 m        n o   	 p q  k  a    L=>6::::6	� 	� � Y� � :
� 	 � � 	"� � 	$� 
� &L+� *L� 	+� +,� .:�6d2� 4� 76dd2� 4S� :� 	� ?� B  � 2:F� H66F� H� � K� O  :����� 4:F� H`6� Rd� � K� O  :����� 4:6
� �6� R� 3� K?� � V  :� � K� O  :����6� R� 3� K?� � V  :� � K� O  :����� 7=� 7>� :� 	� ?� Y  � `� 
6	� ::���D� 	Z� � 		� \  � � 	_� YSYSY� aS� eW� 	� �  l � � =��� =  l   � >          
            %  1  9  A  I  O  U  X   _ ! g " l % { & � ) � ' � ( � + � , � / � 0 � / � 3 � 5 � 6 5	 9 ; =' >3 ?A AQ =W Ed Fp G~ I� E� N� O� R� P� Q� T� U� V� Y� Z� ;� ]� ^� _ ` a m   �  �  r s �  t s  � u v    w x    y z  
 { v   | v  
 } v   ~ z  �  z  � � z  � � z  � � v 	 1� � � 
 g� � x  l� � v  �h � z  �_ � v  �\ � v  �   j � X  � / / / / /   � 6  � / / / / /  �  =�  /!!	� 	##N =�   �    � �     �  � �  � �  � �  � �   
  � � � 