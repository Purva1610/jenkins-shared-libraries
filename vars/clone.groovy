def(String url,String branch){
  echo "code is cloning"
  git url: url, branch: branch
  echo "code clonned successfully"
  }
