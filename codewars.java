public Users{
  int progress = 0;
  int rank = -8;
  public int rank(int rank){
    return rank;
  }
  public void progress(){
    //progress >100 =rank++
    int d = quest - rank;
    if(progress >100){
      Users.incprogress(rank);
    }
      if(rank < -7){
        
        progress = 10*d*d;
      }
  }
  public int incprogress(int quest){
      int d = quest - rank;
      progress = 10*d*d;
      return ;
  }