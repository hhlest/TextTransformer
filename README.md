# TextTransformer

TextTransformer class.

Method:
String transform(String text) - Converts text to uppercase. Example hello→ HELLO.

Class InverseTransformer as a subclass of TextTransformer. Override the String transform(String text) method - Reverses the text. Example hello → olleh.
Class UpDownTransformer as a subclass of TextTransformer. Override the String transform(String text) method — Every odd letter is big, even is small. Example hello → HeLlO.

TextSaver class.
Fields:
TextTransformer transformer.
File file 
Methods:
void saveTextToFile(String text) — First, one of the transformers (transformer field) converts a string, and then saves it to a file (file field).
