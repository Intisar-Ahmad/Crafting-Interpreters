#include <stdio.h>
#include<stdlib.h>

// Node struct
typedef struct Node{
    int data;
    struct Node* left;
    struct Node* right;
}Node;


Node* createNode(int data){
    Node* node = (Node*)malloc(sizeof(Node));
    node->data = data;
    node->right = node->left = NULL;
    return node;

}

// void insertNode
Node* insertNode(Node* root,int data){
    if(!root){
        return createNode(data);
    }
    if(data < root->data){
        root->left = insertNode(root->left,data);
    }
    else{ 
        root->right = insertNode(root->right,data);
    }
    return root;
}

// preorder traversal
void preOrder(Node* root){
    if(!root) return;

    printf("%d ",root->data);
    preOrder(root->left);
    preOrder(root->right);

}


int main() {
    Node* root = createNode(5);
    root = insertNode(root,2);
    root = insertNode(root,3);
    root = insertNode(root,1);
    root = insertNode(root,6);
    root = insertNode(root,8);


    preOrder(root);
    printf("\n");
    return 0;
}