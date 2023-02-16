a class node with the attributes data & next;
    next points to the next node;
another classwith the attributes head & tail;
addNode(), of course, adds a new node to the list;
    Creates a new node
    checks whether the head is null, meaning there is nothing in the list;
    if it is empty, the head and tail will point to the newly added node;
    if it is not empty, the new node will be added to the end of the list, and that tail's next will point to the newly added node;
display() displays nodes present in the list;
    define a node points to the head of the list;
    traverse through the list until current points to null;
    display each node by making the current to point to node next in each iteration.