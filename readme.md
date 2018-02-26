# CSC-207 2018S Mentor Notes

### Exam 1 Mentor Session
`Sunday, February 25, 2018`

###### Are read/write permissions the same for private, public and protected methods?
Yes.

###### Why do we set fields to private if we need to have setters/getters anyway?
`Setters` and `getters` hide the abstracts the implementation within the class so that the user doesn't have to deal with it. They can also enforce constraints over the values that the user tries to put into field directly, e.g. you wouldn't want an input `9999` for the field `year` in a `time` class.  

###### When do we mark a class `abstract`?
Remember that a class marked `abstract` allows both concrete implementation and unimplemented methods. The decision to use it can be somewhat arbitrary and much less tangible compare to a normal, fully implemented class and `interfaces`. There are times when an abstract class makes more sense, for example, when there are **both**
- default behaviors associated with the class itself, and
- behaviors that are entirely up to the classes that will extend this abstract class.
