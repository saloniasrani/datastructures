class GNode{
            int indegree; 
            List<Integer> outDegrees = new ArrayList<>(); 
        }
       
        
        public boolean canFinish(int numCourses, int[][] prerequisites) {
                   
            Map<Integer, GNode> map = new HashMap<>(); 
            
            for(int i=0; i<= numCourses-1; i++){
                map.put(i, new GNode()); 
            }
            
            // Populate map and add data in the nodes. 
            for (int i=0; i< prerequisites.length; i++){
                GNode first = getNode(prerequisites[i][1], map); 
                GNode second = getNode(prerequisites[i][0], map); 
                first.outDegrees.add(prerequisites[i][0]); 
                second.indegree++; 
            }
            
            
            List<Integer> finishedNodes = new ArrayList<>(); 
            
            for(int i=0; i<= numCourses-1; i++){
                GNode node = map.get(i); 
                if(node.indegree == 0){
                    finishedNodes.add(i); 
                }            
            }
      
            int removedEdges = 0; 
            int toRemove = prerequisites.length ; 
            
            
            while(finishedNodes.size() > 0){
                int key = finishedNodes.remove(0); 
                GNode node = map.get(key); 
                
                for(Integer neighbor: node.outDegrees){
                    GNode neighborNode = map.get(neighbor); 
                    neighborNode.indegree--; 
                    removedEdges++; 
                    if(neighborNode.indegree ==0 ){
                        finishedNodes.add(neighbor); 
                    }       
                }
                   
            }
            
            System.out.println("Removed Edges : " + removedEdges);
            
            if(removedEdges != toRemove ){
                return false; 
            }
            
            return true; 
        }
        
        public GNode getNode(int key, Map<Integer, GNode> map){       
            if(!map.containsKey(key)){
                GNode newNode = new GNode(); 
                map.put(key, newNode);
            } 
            return map.get(key);
        }
        
        
        