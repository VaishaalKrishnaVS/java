from collections import defaultdict

class Graph:
    def __init__(self):
        self.graph = defaultdict(list)

    def addEdge(self,u,v):
        self.graph[u].append(v)
   
    def DFSUtil(self,v,visited):
        visited[v]= True
        print(v)
        for i in self.graph[v]:
            if visited[i] == False:
                self.DFSUtil(i, visited)

    def DFS(self,v):
        visited = [False]*(len(self.graph))
        self.DFSUtil(v,visited)

g = Graph()
n=eval(input("enter the number of vertex"))
for i in range(0,n):
    a,b=eval(input("enter the edge"))
    g.addEdge(a,b)

c=eval(input("enter the starting vertex"))
g.DFS(c)    	