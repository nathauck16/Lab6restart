class Tree{
    private String treeName;
    private String treeType;
    private boolean leavesFall;
    private String leafColor;

    Tree()
    {
      treeName = "";
      treeType = "";
      leavesFall = false;
      leafColor = "";
    }

    Tree(String aTreeName, String aTreeType, boolean doLeavesFall, String aLeafColor)
    {
      treeName = aTreeName;
      treeType = aTreeType;
      leavesFall = doLeavesFall;
      leafColor = aLeafColor;
    }


    void setName(String aTreeName)
    {
      treeName = aTreeName;
    }
    void setType(String aTreeType)
    {
      treeType = aTreeType;
    }
    void setleavesFall(boolean doLeavesFall)
    {
      leavesFall = doLeavesFall;
    }
    void setColor(String aLeafColor)
    {
      leafColor = aLeafColor;
    }


    String getName(){
      return treeName;
    }
    String getType(){
      return treeType;
    }
    boolean getleavesFall(){
      return leavesFall;
    }
   String setColor(){
      return leafColor;
    }


    void print(){
      System.out.println();
      System.out.println("This is a " + treeName + "tree. It is a " + treeType + "and its leaves are currently " + leafColor + ". It  " + leavesFall + " lose its leaves for the winter");
    }

    String hasLeaves(){
      if(leavesFall ==true){
        return "does";
      }else{
        return "does not";
      }
    }
    
}