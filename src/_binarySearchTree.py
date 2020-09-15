class Node:
  def __init__(self,val):
    self.val=val
    self.left=None
    self.right=None

class BST:
  def __init__(self):
    self.root=None
    pass

  def insert(self,value):
    def helper(root):
      if root is None:
        return Node(value)
      if value == root.val:
        return root
      elif value<root.val:
        root.left=helper(root.left)
      else:
        root.right = helper(root.right)
      return root

    self.root = helper(self.root)
  
  def inOrder(self):
    def helper(root):
      if root is None:
        return
      helper(root.left)
      print(root.val,end="")
      helper(root.right)

    helper(self.root)

  def search(self,value):
    def helper(root):
      if root is None:
        return False
      if root.val==value:
        return True
      if value<root.val:
        return helper(root.left)
      else:
        return helper(root.right)
    return helper(self.root)

  def delete(self,value):
    def helper(root,value):
      if root is None:
        return root
      if value<root.val:
        root.left = helper(root.left,value)
      elif value>root.val:
        root.right = helper(root.right,value)
      else:
        if root.left==None:
          temp = root.right
          root=None
          return temp

        elif root.right==None:
          temp = root.left
          root=None
          return temp
        else:
          current = root.right
          while not current.left==None:
            current=current.left
          root.val=current.val
          root.right = helper(root.right,current.val)
      return root
    helper(self.root,value)

#creating a bst node
tree = BST()
#inserting data into the tree
tree.insert(5)
tree.insert(8)
tree.insert(3)
tree.insert(1)
#traversing in inorder fashion
tree.inOrder()

#search 5 in tree
print(tree.search(5))

#search 6 in tree
print(tree.search(6))

#search 8 in tree
print(tree.search(8))

#delete 5 in tree
tree.delete(5)

#traversing in inorder fashion
tree.inOrder()


