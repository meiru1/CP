public class Main{
  public static void main(String[] args) {
    //instance add
    InterfaceMan im = new InterfaceMan();
    Quizman qm = new Quizman();

    //message input
    im.showMsgInput();
    //quizmanに回答を渡して判定
    int userAnswer = im.getUserAnswer();
    if(qm.judhe(userAnswer)){
      im.showMsgAtari();
    }else{
      im.showMsgHazure();
    }
  }
}
