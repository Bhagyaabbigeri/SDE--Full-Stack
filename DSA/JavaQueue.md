<<<<<<< HEAD
# Queue in Java - Enhanced Notes

This document provides a **clean, structured, and industry-relevant implementation** of a Queue in Java. It includes **real-world analogies**, use cases, and **developer-friendly comments** for easy understanding and practical use.

---

## 🚀 What is a Queue?

A **Queue** is a **linear data structure** that follows the **FIFO (First-In-First-Out)** principle:
- The element inserted first is removed first.
- Insertions happen at the **rear**, and deletions at the **front**.

### 🏗️ Real-World Analogy:
Imagine a **line at a ticket counter**—the first person in line is the first to be served.

### 🧠 Industry Use Cases:
- **Task scheduling** (OS, thread pools)
- **Breadth-First Search** in graphs/trees
- **Print spooling** systems
- **Data stream processing**

---

## 🧱 Node Class
```java
/**
 * Represents a node in a queue (linked list-based).
 */
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
```

---

## 🧰 Queue Class - Core API
```java
/**
 * Implements a Queue using a linked list.
 */
public class Queue {
    Node front, rear;

    public Queue() {
        this.front = this.rear = null;
    }
```

---

## 🔧 Core Operations

### 1. Enqueue (Add to Rear)
```java
    public void enqueue(int data) {
        Node newNode = new Node(data);

        if (rear == null) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }
```

### 2. Dequeue (Remove from Front)
```java
    public int dequeue() {
    if (front == null) {
        System.out.println("Queue is empty");
        return -1; // or throw an exception if preferred
    }

    int data = front.data; 
    front = front.next;

    if (front == null) {
        rear = null;
    }

    return data;
}

```

### 3. Peek (Front Element)
```java
    public int peek() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        return front.data;
    }
```

### 4. Check if Empty
```java
    public boolean isEmpty() {
        return front == null;
    }
```

### 5. Display Queue
```java
    public void display() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }

        Node current = front;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("None");
    }
}
```

---

## 🧪 Driver Code Example
```java
public class Main {
    public static void main(String[] args) {
        Queue q = new Queue();

        q.dequeue();  // Empty queue

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();  // 10 --> 20 --> 30 --> None

        q.dequeue();  // Remove 10
        q.display();  // 20 --> 30 --> None

        System.out.println("Front: " + q.peek()); // 20
    }
}
```

---

## 📌 Tips for Developers
- Always check for underflow before dequeue or peek.
- Prefer linked list implementation for dynamic memory use.
- Thread-safe variants: `ConcurrentLinkedQueue`, `LinkedBlockingQueue`.

---

## 📍 Conclusion

Queues are essential for building reliable systems that need **ordered processing** of tasks. Java offers both simple and concurrent queue types to meet modern application needs.

For more:
- [Algorithms365 YouTube](https://www.youtube.com/@algorithms365)
- [MIT License](https://opensource.org/licenses/MIT)

=======
# Queue in Java - Enhanced Notes

This document provides a **clean, structured, and industry-relevant implementation** of a Queue in Java. It includes **real-world analogies**, use cases, and **developer-friendly comments** for easy understanding and practical use.

---

## 🚀 What is a Queue?

A **Queue** is a **linear data structure** that follows the **FIFO (First-In-First-Out)** principle:
- The element inserted first is removed first.
- Insertions happen at the **rear**, and deletions at the **front**.

### 🏗️ Real-World Analogy:
Imagine a **line at a ticket counter**—the first person in line is the first to be served.

### 🧠 Industry Use Cases:
- **Task scheduling** (OS, thread pools)
- **Breadth-First Search** in graphs/trees
- **Print spooling** systems
- **Data stream processing**

---

## 🧱 Node Class
```java
/**
 * Represents a node in a queue (linked list-based).
 */
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
```

---

## 🧰 Queue Class - Core API
```java
/**
 * Implements a Queue using a linked list.
 */
public class Queue {
    Node front, rear;

    public Queue() {
        this.front = this.rear = null;
    }
```

---

## 🔧 Core Operations

### 1. Enqueue (Add to Rear)
```java
    public void enqueue(int data) {
        Node newNode = new Node(data);

        if (rear == null) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }
```

### 2. Dequeue (Remove from Front)
```java
    public int dequeue() {
    if (front == null) {
        System.out.println("Queue is empty");
        return -1; // or throw an exception if preferred
    }

    int data = front.data; 
    front = front.next;

    if (front == null) {
        rear = null;
    }

    return data;
}

```

### 3. Peek (Front Element)
```java
    public int peek() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        return front.data;
    }
```

### 4. Check if Empty
```java
    public boolean isEmpty() {
        return front == null;
    }
```

### 5. Display Queue
```java
    public void display() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }

        Node current = front;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("None");
    }
}
```

---

## 🧪 Driver Code Example
```java
public class Main {
    public static void main(String[] args) {
        Queue q = new Queue();

        q.dequeue();  // Empty queue

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();  // 10 --> 20 --> 30 --> None

        q.dequeue();  // Remove 10
        q.display();  // 20 --> 30 --> None

        System.out.println("Front: " + q.peek()); // 20
    }
}
```

---

## 📌 Tips for Developers
- Always check for underflow before dequeue or peek.
- Prefer linked list implementation for dynamic memory use.
- Thread-safe variants: `ConcurrentLinkedQueue`, `LinkedBlockingQueue`.

---

## 📍 Conclusion

Queues are essential for building reliable systems that need **ordered processing** of tasks. Java offers both simple and concurrent queue types to meet modern application needs.

For more:
- [Algorithms365 YouTube](https://www.youtube.com/@algorithms365)
- [MIT License](https://opensource.org/licenses/MIT)

>>>>>>> 7ebb9c4bf653ae0912b8c1045321eb2844921530
Stay updated with **Algorithms365** for real-world coding mastery.