����   @ b
      java/lang/Object <init> ()V	  	 
   java/lang/System out Ljava/io/PrintStream;  /-----------------------------------------------
      java/io/PrintStream println (Ljava/lang/String;)V  java/util/Scanner	     in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V  Enter number: 
  ! " # printf <(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
  % & ' 
nextDouble ()D ) <Enter arithmetic operation symbol (one of '+','-','*','/'): 
  + , - next ()Ljava/lang/String;
 / 0 1 2 3 java/lang/String charAt (I)C 5 Enter second number: 
  7   9 %.2f %c %.2f = %.2f

 ; < = > ? java/lang/Double valueOf (D)Ljava/lang/Double;
 A B C > D java/lang/Character (C)Ljava/lang/Character; F Once more? ('Y' or 'y'): 
  H I  close K Task_3 Code LineNumberTable LocalVariableTable this LTask_3; main ([Ljava/lang/String;)V result D numA opChar C numB args [Ljava/lang/String; getOut Z sc Ljava/util/Scanner; StackMapTable 
SourceFile Task_3.java ! J           L   3     *� �    M   
    	  
 N        O P   	 Q R  L  �  
  �<� � � Y� � M�{� � �  W,� $J� (� �  W,� *� .6� 4� �  W,� $9� � 6�     �   *   /   '   \   �   �   �   �)k9� 8� Y)� :SY� @SY� :SY� :S�  W� �)c9� 8� Y)� :SY� @SY� :SY� :S�  W� o<� j)g9� 8� Y)� :SY� @SY� :SY� :S�  W� 5)o9� 8� Y)� :SY� @SY� :SY� :S�  W� � � E� �  W,� *� .6y� Y� <� <���� � 6,� G�    M   � #      
      &  +  8  B  O  U  [  �  �  �  � ! � " � # � ' � ( � * � +% ,( .. /Z 2b 3o 4y 5� 6� 8� :� <� =� > N   f 
 � / S T  � / S T  � / S T . , S T  +c U T  BL V W  U9 X T   � Y Z   � [ \  � ] ^  _    
�  � n44411�   `    a