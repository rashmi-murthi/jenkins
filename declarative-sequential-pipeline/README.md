# 📘 Jenkins Pipelines: Declarative & Declarative Sequential  
### *Real CI/CD Example – Maven + Docker + Deployment*

This repository contains two important Jenkins pipeline types used in real DevOps projects:

1. **Declarative Pipeline** (modern structured syntax)  
2. **Declarative Sequential Pipeline** (stage-by-stage execution flow)

Both pipelines use Declarative syntax, but the structure and purpose differ slightly.

The example used here is a real CI/CD flow for a **Java Maven + Docker application** deployed as a container.

---

# 🚀 1. Declarative Pipeline (Modern CI/CD)

### ✔ What It Is  
A **structured, modern Jenkins syntax** that uses:

```
pipeline {
    agent any
    stages { ... }
}
```

This is the most widely used approach in DevOps pipelines today.

### ✔ Why It’s Used  
- Clear and readable  
- Built-in validation  
- Supports parallel stages  
- Easy collaboration for teams  
- Best for production CI/CD  

---

## 📌 **Declarative Pipeline Example (Student-App CI/CD)**

```groovy

pipeline {
    agent any
    stages {
        stage('Build') { steps { echo "Build" } }
        stage('Test') { steps { echo "Test" } }
    }
}

```

---

# 🟩 2. Declarative Sequential Pipeline (Simplified Stage Flow)

### ✔ What It Is  
A **step-by-step pipeline**, where each stage runs in order:

```
Stage 1 → Stage 2 → Stage 3 → Stage 4 → Stage 5
```

Still uses the **same Declarative syntax**, but focuses on a clean sequential flow.

### ✔ Why Use It  
- Easy to teach/learn  
- Perfect for simple CI/CD  
- Great for smaller applications  
- Best for deployment-only pipelines  

---

## 📌 **Declarative Sequential Pipeline Example**

```groovy
pipeline {
    agent any
    stages {
        stage('1') { steps { echo "1" } }
        stage('2') { steps { echo "2" } }
        stage('3') { steps { echo "3" } }
    }
}

```

---

# 🟨 3. Difference Between Declarative & Declarative Sequential

| Feature | Declarative Pipeline | Declarative Sequential Pipeline |
|--------|----------------------|---------------------------------|
| **Syntax** | `pipeline {}` | `pipeline {}` (same) |
| **Purpose** | Modern structured CI/CD | Simple stage-by-stage execution |
| **Flow** | Can include parallel + sequential stages | Only sequential |
| **Flexibility** | Higher | Medium |
| **Best For** | Full CI/CD pipelines | Lightweight workflows |
| **Real Use Cases** | Maven build, Docker, deployment | Basic deployments, training, small apps |

---

# 🎯 Final Summary

- Both pipelines use **Declarative syntax**  
- Both are valid and widely used in DevOps  
- Main difference is **pipeline structure and level of detail**  
- Your Student App CI/CD pipeline demonstrates real-world DevOps tasks:
  - Git checkout  
  - Maven build  
  - Docker build  
  - Image push  
  - Deployment  

This repo clearly demonstrates **professional Jenkins pipeline skills** suitable for interviews and portfolio projects.
# 📘 Jenkins Pipelines: Declarative & Declarative Sequential  
### *Real CI/CD Example – Maven + Docker + Deployment*

This repository contains two important Jenkins pipeline types used in real DevOps projects:

1. **Declarative Pipeline** (modern structured syntax)  
2. **Declarative Sequential Pipeline** (stage-by-stage execution flow)

Both pipelines use Declarative syntax, but the structure and purpose differ slightly.

The example used here is a real CI/CD flow for a **Java Maven + Docker application** deployed as a container.

---

# 🚀 1. Declarative Pipeline (Modern CI/CD)

### ✔ What It Is  
A **structured, modern Jenkins syntax** that uses:

```
pipeline {
    agent any
    stages { ... }
}
```

This is the most widely used approach in DevOps pipelines today.

### ✔ Why It’s Used  
- Clear and readable  
- Built-in validation  
- Supports parallel stages  
- Easy collaboration for teams  
- Best for production CI/CD  

---

## 📌 **Declarative Pipeline Example (Student-App CI/CD)**

```groovy

pipeline {
    agent any
    stages {
        stage('Build') { steps { echo "Build" } }
        stage('Test') { steps { echo "Test" } }
    }
}

```

---

# 🟩 2. Declarative Sequential Pipeline (Simplified Stage Flow)

### ✔ What It Is  
A **step-by-step pipeline**, where each stage runs in order:

```
Stage 1 → Stage 2 → Stage 3 → Stage 4 → Stage 5
```

Still uses the **same Declarative syntax**, but focuses on a clean sequential flow.

### ✔ Why Use It  
- Easy to teach/learn  
- Perfect for simple CI/CD  
- Great for smaller applications  
- Best for deployment-only pipelines  

---

## 📌 **Declarative Sequential Pipeline Example**

```groovy
pipeline {
    agent any
    stages {
        stage('1') { steps { echo "1" } }
        stage('2') { steps { echo "2" } }
        stage('3') { steps { echo "3" } }
    }
}

```

---

# 🟨 3. Difference Between Declarative & Declarative Sequential

| Feature | Declarative Pipeline | Declarative Sequential Pipeline |
|--------|----------------------|---------------------------------|
| **Syntax** | `pipeline {}` | `pipeline {}` (same) |
| **Purpose** | Modern structured CI/CD | Simple stage-by-stage execution |
| **Flow** | Can include parallel + sequential stages | Only sequential |
| **Flexibility** | Higher | Medium |
| **Best For** | Full CI/CD pipelines | Lightweight workflows |
| **Real Use Cases** | Maven build, Docker, deployment | Basic deployments, training, small apps |

---

# 🎯 Final Summary

- Both pipelines use **Declarative syntax**  
- Both are valid and widely used in DevOps  
- Main difference is **pipeline structure and level of detail**  
- Your Student App CI/CD pipeline demonstrates real-world DevOps tasks:
  - Git checkout  
  - Maven build  
  - Docker build  
  - Image push  
  - Deployment  

This repo clearly demonstrates **professional Jenkins pipeline skills** suitable for interviews and portfolio projects.

