<h1 align="center">✈️ Avaj Launcher</h1>
<p align="center">
  <img src="https://img.shields.io/badge/grade-0%2F100-green?style=for-the-badge&logo=42&labelColor=gray"/>
</p>

<p align="center">
  <a href="https://github.com/pin3dev/42_Cursus/tree/main/so_long">
    <img src="https://img.shields.io/badge/UML-blue?style=for-the-badge"/>
    <img src="https://img.shields.io/badge/Java-blue?style=for-the-badge"/>
    <img src="https://img.shields.io/badge/Singleton-blue?style=for-the-badge"/>
    <img src="https://img.shields.io/badge/Observer-blue?style=for-the-badge"/>
    <img src="https://img.shields.io/badge/Factory-blue?style=for-the-badge"/>
    <img src="https://img.shields.io/badge/GoF-blue?style=for-the-badge"/>
  </a>
</p>

<p align="center">
  <img src="" width="600" height="375" />
</p>

<h3>
  <p align="center">
    <a href="#introduction">Introduction</a> •
    <a href="#structure">Structure</a> •
    <a href="#docs">Docs</a> •
    <a href="#cloning">Cloning</a> •
    <a href="#usage">Usage</a> •
    <a href="#norms">Norms</a> •
    <!--<a href="#tutorial">Tutorial</a> •-->
    <a href="#contributors">Contributors</a>
  </p>
</h3>

## 🗣️ Introduction <a id="introduction"></a>

The **Avaj Launcher** project is an introductory exercise into the world of **Java**, **UML class diagrams**, and **Object-Oriented Design**.
You will develop a minimal aircraft simulation that models interactions between flying objects and dynamic weather conditions, following a predefined architecture inspired by standard design patterns such as **Observer**, **Singleton**, and **Factory**.

This project aims to strengthen your understanding of software design, clean code structure, and maintainability, consistent with the pedagogical principles of the **42 School**.


## 🧬 Project Structure <a id="structure"></a>

The project is organized into several core logical components:

* **Simulation Engine**
  Handles the flow of the simulation, orchestrating weather updates and interactions between system components.

* **Aircraft System**
  Implements different aircraft types, each responding uniquely to weather changes.

* **Weather Module**
  Produces varying weather conditions and broadcasts updates to all registered aircrafts.

* **Scenario Parsing**
  Interprets the configuration required to initialize the simulation.

* **Design Patterns**
  Ensures the project adheres to object-oriented best practices for extensibility and clarity.

These components work together to model coordinated behavior in a controlled environment, encouraging modular and scalable architecture design.

## 🗃️ Documentation <a id="docs"></a>

This project provides complete technical documentation generated with Javadoc,
covering the class hierarchy, package organization, and core behaviors of the
simulation.

The documentation can be accessed via the HTML entry point below:

<p align="center">
  <a href="https://pin3dev.github.io/RNCP6_avaj-launcher/">
    <img src="https://img.shields.io/badge/Avaj_Docs-blue?style=for-the-badge"/>
  </a>
</p>
<!--


## 🫥 Cloning the Repository <a id="cloning"></a>

To download the project:

```bash
git clone https://github.com/pin3dev/RNCP6_avaj-launcher.git
cd RNCP6_avaj-launcher/avaj
```

## 🕹️ Compilation and Usage <a id="usage"></a>

### Compilation

A manual compilation flow is used for this project:

```bash
make compile
```

### Running the Simulation

Execute the simulator with a scenario file:

```bash
make run
```

A log file describing the full simulation will be generated automatically.

<!--

## 📄 Scenario File <a id="scenario"></a>

The scenario file describes both the number of simulation cycles and the list of aircraft involved.
Format explanation and examples are provided in the documentation.

-->

## ⚠️ Norms and Guidelines Disclaimer <a id="norms"></a>

This project follows the official Java constraints and structural conventions defined by the 42 curriculum.
It emphasizes:

* clean design and maintainability
* correct use of OOP principles
* strict adherence to mandatory architecture

Full requirements are described in the project documentation.


## 👥 Contributors <a id="contributors"></a>

<a href="https://github.com/pin3dev">
  <img src="https://img.shields.io/badge/Ivany_Pinheiro-%40pin3dev-purple?style=for-the-badge"/>  
</a>

<!--
links:
https://docs.oracle.com/javase/tutorial/java/package/namingpkgs.html
https://www.baeldung.com/java-random-seed
https://refactoring.guru/pt-br/design-patterns/observer/java/example
https://www.coursera.org/articles/gang-of-four-design-patterns?utm_medium=sem&utm_source=gg&utm_campaign=b2c_emea_x_multi_ftcof_career-academy_cx_dr_bau_gg_pmax_gc_s1_en_m_hyb_23-12_desktop&campaignid=20858198824&adgroupid=&device=c&keyword=&matchtype=&network=x&devicemodel=&creativeid=&assetgroupid=6490027433&targetid=&extensionid=&placement=&gad_source=1&gad_campaignid=20854471652&gbraid=0AAAAADdKX6YD7VoJg5yizZLsrsfLHzNSm&gclid=CjwKCAiAybfLBhAjEiwAI0mBBl6Vc1DUVPEPJ1tuFo29dLI4C4P4KgN8vUZUHv_1QZYztqht02sZ9xoCFu0QAvD_BwE
https://www.digitalocean.com/community/tutorials/gangs-of-four-gof-design-patterns

