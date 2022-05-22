#include <stdio.h>

class PasswordProtector;	//forward class declaration

class PasswordClient
{
public:
	virtual void alarm() = 0;
	void setMyProtector(PasswordProtector* theProtector);
protected:
	PasswordProtector *myProtector;
};

void PasswordClient::setMyProtector(PasswordProtector* theProtector)
{
	myProtector = theProtector;
}

class PasswordProtector
{
public:
	void Register(int code, PasswordClient* client);
	void check(int code);
private:
	int safeNumber;
	PasswordClient* myClient;
};

void PasswordProtector::Register(int code, PasswordClient* client)
{
	safeNumber = code;
	myClient = client;
	client->setMyProtector(this);
}

void PasswordProtector::check(int code)
{
	if(code !=safeNumber)
		myClient->alarm();
}

class Door
{
public:
	virtual void lock() = 0;
	virtual void unlock() = 0;
};

class ProtectedDoor: public Door, public PasswordClient
{
public:
	virtual void lock();
	virtual void unlock();
	virtual void alarm();
private:
	bool locked;
};

void ProtectedDoor::lock()
{
	locked = true;
}

void ProtectedDoor::unlock()
{
	int number;
	printf("Enter code: ");
	scanf("%d", &number);
	myProtector->check(number);
}

void ProtectedDoor::alarm()
{
	printf("ALARM: Someone is trying to enter without code!!\n");
}

int main()
{
	PasswordProtector protector;
	ProtectedDoor door;

	protector.Register(2525, &door);

	door.unlock();

	return 0;
}