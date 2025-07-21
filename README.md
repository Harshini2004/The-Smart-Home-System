# The-Smart-Home-System
The Smart Home System using interface and polymorphism
Overview
This project simulates a Smart Home System that can control a variety of electronic devices like:
Lights
Fans
Air Conditioners
Each device shares common behaviors (e.g., turn on/off) but also has device-specific operations (e.g., brightness for lights, temperature for ACs).
The system is designed to be extensible, meaning new devices can be added without changing existing code.

Goals
Common control interface for all devices
Unique behavior for specific devices
Easily add new devices in the future
Follow OOP principles: Abstraction, Inheritance, Polymorphism
Comply with Open/Closed Principle (Open for extension, closed for modification)

Implementation Approach (Java)
1. Device Interface
Defines common behaviors like turnOn() and turnOff().
2. AbstractDevice Class
Provides base logic (optional) and enforces a structure.
3. Concrete Device Classes
Each device (Light, Fan, AC) extends the abstract class and defines specific behaviors like brightness or temperature control.

