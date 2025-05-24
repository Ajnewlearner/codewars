// TODO: create the User class/object
// it must support rank, progress, and the incProgress(int rank) method
public class codewars{
  int progress;
  int rank;
  
  private static final int[] Ranks= {-8,-7,-6,-5,-4,-3,-2,-1,1,2,3,4,5,6,7,8};
  
  public codewars(){
    this.rank = -8;
    this.progress = 0;
  }
  public void incProgress(int activityRank){
    //progress >100 =rank++
    if(rank == 8) return;
    
    int userIndex = currentRankIndex(rank);
    int activityIndex = currentRankIndex(activityRank);
    
    int d = activityIndex - userIndex;
    
    int earned;
    
    if(d == 0) earned = 3;
    else if(d == -1) earned = 1;
    else if(d <= -2) return;
    else earned = 10*d*d;
    
    addProgress(earned);
    }
  
  public void addProgress(int earned){
    progress += earned;
    while(progress >= 100 && rank < 8){
      progress -= 100;
      int currentIndex = currentRankIndex(rank);
      rank = Ranks[++currentIndex];
    }
    if(rank == 8){
      progress = 0;
    }
  }    
    private boolean isValidRank(int r) {
        for (int val : Ranks) {
            if (val == r) return true;
        }
        return false;
    }

    private int currentRankIndex(int r) {
        for (int i = 0; i < Ranks.length; i++) {
            if (Ranks[i] == r) return i;
        }
        throw new IllegalArgumentException("Invalid rank: " + r);
    }
  }

  