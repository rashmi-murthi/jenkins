# Jenkins Pipeline: Sequential vs Parallel (Simple & Clean)

This README explains **Sequential**, **Parallel**, and **Mixed execution** inside a **single main Jenkins pipeline** using simple examples.

---

## ✅ 1. Sequential Pipeline (Runs One After Another)

```
pipeline {
  agent any
  stages {
    stage('A') { steps { echo "Running A" } }
    stage('B') { steps { echo "Running B" } }
    stage('C') { steps { echo "Running C" } }
  }
}
```

### 📌 Flow:
A → B → C (each stage waits for the previous one to finish)

---

## ✅ 2. Parallel Pipeline (Runs at the Same Time)

```
pipeline {
  agent any
  stages {
    stage('Parallel Jobs') {
      parallel {
        stage('Job A') { steps { echo "Running Job A" } }
        stage('Job B') { steps { echo "Running Job B" } }
        stage('Job C') { steps { echo "Running Job C" } }
      }
    }
  }
}
```

### 📌 Flow:
All jobs run together:
Job A  
Job B  
Job C  

---

## ✅ 3. Mixed Pipeline (Sequential + Parallel Combined)

```
pipeline {
  agent any
  stages {

    stage('Build') {
      steps { echo "Building..." }
    }

    stage('Tests in Parallel') {
      parallel {
        stage('Unit Tests') { steps { echo "Running Unit Tests" } }
        stage('API Tests') { steps { echo "Running API Tests" } }
        stage('UI Tests') { steps { echo "Running UI Tests" } }
      }
    }

    stage('Deploy') {
      steps { echo "Deploying..." }
    }
  }
}
```

### 📌 Flow:
Build  
→ (Parallel Tests: Unit + API + UI)  
→ Deploy  

---

## 🎯 Summary

| Type       | Execution Flow | Best For |
|------------|----------------|----------|
| Sequential | A → B → C | Build → Test → Deploy |
| Parallel   | A + B + C at same time | Testing, independent tasks |
| Mixed      | Sequential + Parallel together | Real CI/CD pipelines |

This gives you a clean understanding of how Jenkins handles different execution styles inside one main pipeline.

