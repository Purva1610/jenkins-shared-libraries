def call(String url, String branch) {
    echo "code is cloning ..."
    
    git url: url, branch: branch
    
    echo "code cloned successfully on branch "
}
