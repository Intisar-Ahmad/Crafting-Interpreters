#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// Do the same thing for C. To get some practice with pointers, define a doubly linked list of heap-allocated strings. Write functions to insert, find, and delete items from it. Test them.

typedef struct string
{
    char *str;
    int size;
} string;

typedef struct Node
{
    string str;
    struct Node *prev;
    struct Node *next;
} Node;

// create a new string
string newStr(char *str, int size)
{
    string s;
    s.size = size;
    s.str = (char *)malloc((size + 1) * sizeof(char));

    if (s.str != NULL && str != NULL)
    {
        strcpy(s.str, str);
    }

    s.str[size] = '\0'; // jsut to be extra safe

    return s;
}

// create a new LL node
Node *newNode(string str)
{
    Node *n = (Node *)malloc(sizeof(Node));

    if (n != NULL)
    {
        n->str = str;
        n->next = n->prev = NULL;
    }
    return n;
}

// inserting Node into linked list
Node *insertNode(Node *head, string str)
{
    if (head == NULL)
    {
        return newNode(str);
    }

    Node *temp = head;
    while (temp->next != NULL)
    {
        temp = temp->next;
    }

    Node *new_node = newNode(str);
    temp->next = new_node;
    new_node->prev = temp;
    return head;
}

// traversal
void traverse(Node *head)
{
    if (head == NULL)
    {
        return;
    }
    Node *temp = head;

    while (temp->next != NULL)
    {
        puts(temp->str.str);
        puts("->");
        temp = temp->next;
    }
    puts(temp->str.str);
    puts("\n");

    while (temp != NULL)
    {
        puts(temp->str.str);
        puts("->");
        temp = temp->prev;
    }
}

// free linked list
void freeIt(Node* head) {
    Node* temp;

    while (head != NULL) {
        temp = head->next;

        if (head->str.str != NULL) {
            free(head->str.str);
        }
        free(head);

        head = temp;
    }
}

int main()
{
    Node *head = newNode(newStr("this is bhino", 14));
    head = insertNode(head, newStr("he is very nice", 16));
    head = insertNode(head, newStr("he is also very smart", 22));

    traverse(head);

    freeIt(head);

    return 0;
}